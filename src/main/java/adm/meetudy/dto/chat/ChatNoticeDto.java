package adm.meetudy.dto.chat;

import adm.meetudy.constant.chat.ChatMessageType;
import adm.meetudy.constant.member.MemberEnum;
import adm.meetudy.domain.chat.ChatNotice;
import adm.meetudy.domain.member.Member;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ChatNoticeDto {

    private Long studyGroupId;

    private Long id;

    private String message;

    private Long senderId;

    private ChatMessageType status;

    public ChatNotice toEntity() {
        return ChatNotice.createChatNotice(
                studyGroupId,
                Member.partialOf(senderId, MemberEnum.USER),
                message
        );
    }

    public static ChatNoticeDto from(ChatNotice chatNotice,
                                     ChatMessageType status
    ) {
        return ChatNoticeDto.builder()
                .studyGroupId(chatNotice.getStudyGroupId())
                .id(chatNotice.getId())
                .message(chatNotice.getMessage())
                .senderId(chatNotice.getMember().getId())
                .status(status)
                .build();
    }

}
