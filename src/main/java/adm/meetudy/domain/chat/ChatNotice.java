package adm.meetudy.domain.chat;

import adm.meetudy.domain.common.BaseEntity;
import adm.meetudy.domain.member.Member;
import adm.meetudy.dto.chat.ChatNoticeDto;
import adm.meetudy.exception.CustomApiException;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Objects;

import static adm.meetudy.constant.error.ErrorEnum.*;
import static org.springframework.http.HttpStatus.BAD_REQUEST;

@Entity
@Getter
@EntityListeners(AuditingEntityListener.class)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "chat_notice",
        indexes = {
                @Index(name = "idx_chat_notice_study_group_id", columnList = "study_group_id"),
        })
public class ChatNotice extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "study_group_id", nullable = false)
    private Long studyGroupId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id", nullable = false)
    private Member member;

    @Column(columnDefinition = "TEXT" , nullable = false)
    private String message;

    @Column(nullable = false)
    private boolean deleted;


    @Builder
    protected ChatNotice(Long id,
                         Long studyGroupId,
                         Member member,
                         String message,
                         boolean deleted
    ) {
        this.id = id;
        this.studyGroupId = studyGroupId;
        this.member = member;
        this.message = message;
        this.deleted = deleted;
    }

    public static ChatNotice createChatNotice(Long studyGroupId,
                                              Member member,
                                              String message
    ) {
        return ChatNotice.builder()
                .studyGroupId(studyGroupId)
                .member(member)
                .message(message)
                .deleted(false)
                .build();
    }

    /**
     * 채팅방 공지 수정
     * @param chatNoticeDto
     */
    public void updateChatNotice(ChatNoticeDto chatNoticeDto) {
        if(this.deleted) {
            throw new CustomApiException(BAD_REQUEST, ERR_012, ERR_012.getValue());
        }
        this.message = chatNoticeDto.getMessage();
    }

    /**
     * 태칭방 공지 삭제
     */
    public void deleteChatNoitce() {
        if(this.deleted) {
            throw new CustomApiException(BAD_REQUEST, ERR_012, ERR_012.getValue());
        }
        this.deleted = true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ChatNotice that = (ChatNotice) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "ChatNotice{" +
                "id=" + id +
                ", studyGroupId=" + studyGroupId +
                ", member=" + member +
                ", message='" + message + '\'' +
                '}';
    }

}
