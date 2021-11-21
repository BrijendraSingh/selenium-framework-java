package bps.builder;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class NewCustomer {
    public String email="default";
    public String password="default";
    public String repeatPassword="default";
    public String maidenName="default";
}
