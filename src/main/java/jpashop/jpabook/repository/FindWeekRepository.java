package jpashop.jpabook.repository;

import jakarta.persistence.EntityManager;
import jpashop.jpabook.domain.ArmDateMenu;
import jpashop.jpabook.domain.DormitoryDateMenu;
import jpashop.jpabook.domain.VisiontowerDateMenu;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.time.DayOfWeek;

@Repository
@RequiredArgsConstructor
public class FindWeekRepository {
    private final EntityManager em;
    public ArmDateMenu armFindMenu(int id){
        return em.find(ArmDateMenu.class, id);
    }
    public VisiontowerDateMenu visiontowerFindMenu(int id){
        return em.find(VisiontowerDateMenu.class, id);
    }
    public DormitoryDateMenu dormitoryFindMenu(int id){
        return em.find(DormitoryDateMenu.class, id);
    }
}
