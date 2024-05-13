package com.ohgiraffers.mapping.section03.compositekey.subsection01.embeddedId;

public class LikeDTO {

    private int LikedMemberNo;

    private int LikedBookNo;

    public LikeDTO(int likedMemberNo, int likedBookNo) {
        LikedMemberNo = likedMemberNo;
        LikedBookNo = likedBookNo;
    }

    public int getLikedMemberNo() {
        return LikedMemberNo;
    }

    public void setLikedMemberNo(int likedMemberNo) {
        LikedMemberNo = likedMemberNo;
    }

    public int getLikedBookNo() {
        return LikedBookNo;
    }

    public void setLikedBookNo(int likedBookNo) {
        LikedBookNo = likedBookNo;
    }

    @Override
    public String toString() {
        return "LikeDTO{" +
                "LikedMemberNo=" + LikedMemberNo +
                ", LikedBookNo=" + LikedBookNo +
                '}';
    }
}
