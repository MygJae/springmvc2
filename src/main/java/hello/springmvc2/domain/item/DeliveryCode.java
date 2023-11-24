package hello.springmvc2.domain.item;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * FAST
 * NORMAL
 * SLOW
 */
@Data
@AllArgsConstructor
public class DeliveryCode {
    private String code;
    private String displayName;

}
