package jpashop.jpabook.service;

import jpashop.jpabook.domain.ArmDateMenu;
import jpashop.jpabook.domain.DormitoryDateMenu;
import jpashop.jpabook.repository.ArmRepository;
import jpashop.jpabook.repository.Dormitory3Repository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ArmService {
    private final ArmRepository ArmRepository;

    ArmDateMenu ArmDateMenu = new ArmDateMenu();
//    List<String> menuList = dormitory3Repository.createMenuList();

    @Transactional // 객체 만들기
    public ArmDateMenu createArmMenu(int dayNumber, String day){
//        dormitory3Repository.deleteMenu();
        ArmDateMenu DateMenu = new ArmDateMenu();

        ArmDateMenu Menu = ArmRepository.makeArmMenu(DateMenu, dayNumber, day);
        this.saveMenuDate(Menu);
        return DateMenu;
    }


    public  List<String> pageCreateDate() {
        return  ArmRepository.newCreateDate();

    }


    @Transactional
    public void saveMenuDate(ArmDateMenu menu){
        ArmRepository.save(menu);
    }

    public List<ArmDateMenu> allDateMenuList(){
        return ArmRepository.allList();
    }


    public List<String> dbDateList() {
       return ArmRepository.dbDateList();
    }

    @Transactional
    public void deleteMenuDate(){
        ArmRepository.deleteMenu();
    }
}