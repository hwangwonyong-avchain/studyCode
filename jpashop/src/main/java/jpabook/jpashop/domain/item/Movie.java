package jpabook.jpashop.domain.item;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("M") // 싱글 테이블일 경우 DB에 저장될 때 구분하기 위한 값
@Getter
@Setter
public class Movie extends Item{

    private String director;
    private String actor;
}
