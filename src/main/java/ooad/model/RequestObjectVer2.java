package ooad.model;

import lombok.*;

/**
 * Created by x148128 on 08/11/2016.
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RequestObjectVer2 {
    private String id;
    private String name;
    private String address;
    private String email;
}
