package com.ohgiraffers.mapping.section03.compositekey.subsection01.embeddedId;

import jakarta.persistence.*;

@Entity
@Table(name = "tbl_like")
public class Like {

    @EmbeddedId
    private LikeCompositeKey likeInfo;

    protected Like() {}

    public Like(LikeCompositeKey likeInfo) {
        this.likeInfo = likeInfo;
    }

    @Override
    public String toString() {
        return "Like{" +
                "likeInfo=" + likeInfo +
                '}';
    }
}
