package org.example.springdatajpa.menu.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tbl_menu")
@Getter
/* @Setter 지양 -> 객체를 언제든지 변경할 수 있으면 객체의 안정성 보장을 할 수 없다.
*  값 변경이 필요한 경우에는 해당 기능을 위한 메소드를 별도로 생성 */
@NoArgsConstructor(access = AccessLevel.PROTECTED)      // 기본 생성자 만들어줌, 제한
/* @AllArgsConstructor */
/* @ToString : 사용 가능하나 연관 관계 매핑 필드는 제거하고 사용 */
public class Menu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int menuCode;
    private String menuName;
    private int menuPrice;
    private int categoryCode;
    private String orderableStatus;


}
