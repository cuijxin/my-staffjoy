package cjx.staffjoy.account.dto;

import cjx.staffjoy.common.api.BaseResponse;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class ListAccountResponse extends BaseResponse {
    private AccountList accountList;
}
