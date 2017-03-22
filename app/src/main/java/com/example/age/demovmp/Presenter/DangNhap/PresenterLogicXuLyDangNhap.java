package com.example.age.demovmp.Presenter.DangNhap;

import com.example.age.demovmp.R;
import com.example.age.demovmp.View.DangNhap.ViewXuLyDangNhap;

/**
 * Created by Age on 3/22/2017.
 */
public class PresenterLogicXuLyDangNhap implements PresenterImpXuLyDangNhap {
    private ViewXuLyDangNhap mViewXuLyDangNhap;

    public PresenterLogicXuLyDangNhap(ViewXuLyDangNhap viewXuLyDangNhap) {
        mViewXuLyDangNhap = viewXuLyDangNhap;
    }

    @Override
    public void KiemTraDangNhap(String tendangnhap, String matkhau) {
        if (tendangnhap.equals(R.string.name_default) && matkhau.equals(R.string.pass_default)) {
            mViewXuLyDangNhap.DangNhapThanhCong();
        } else {
            mViewXuLyDangNhap.DangNhapThatBai();
        }
    }
}
