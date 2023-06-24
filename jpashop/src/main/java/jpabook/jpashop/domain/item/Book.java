package jpabook.jpashop.domain.item;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("B") // 싱글 테이블일 경우 DB에 저장될 때 구분하기 위한 값
@Getter
@Setter
public class Book extends Item{

    private String author;
    private String isbn;
}
