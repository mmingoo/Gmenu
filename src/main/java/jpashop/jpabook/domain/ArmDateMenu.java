package jpashop.jpabook.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Bean;

@Entity
@Setter @Getter
public class ArmDateMenu {

    @Id
    @GeneratedValue
    public Long id;
    public String date;
    public String launchMenu;
    public String dinnerMenu;

    public void String() {
        System.out.println("Date: " + date);
        System.out.println("\nLunch Menu 1: " + launchMenu);
        System.out.println("\nDinner Menu: " + dinnerMenu);

    }
}
