package com.example.age.demovmp.View.DangNhap;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.age.demovmp.Presenter.DangNhap.PresenterLogicXuLyDangNhap;
import com.example.age.demovmp.R;

public class MainActivity extends AppCompatActivity implements ViewXuLyDangNhap,
    View.OnClickListener {
    private Button btnDongY;
    private EditText edTenDangNhap, edMatKhau;
    private PresenterLogicXuLyDangNhap presenterLogicXuLyDangNhap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnDongY = (Button) findViewById(R.id.btnDongY);
        edTenDangNhap = (EditText) findViewById(R.id.edTenDangNhap);
        edMatKhau = (EditText) findViewById(R.id.edMatKhau);
        presenterLogicXuLyDangNhap = new PresenterLogicXuLyDangNhap(this);
        btnDongY.setOnClickListener(this);
    }

    @Override
    public void DangNhapThanhCong() {
        Toast.makeText(this, R.string.msg_success, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void DangNhapThatBai() {
        Toast.makeText(this, R.string.msg_fail, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View v) {
        String tendangnhap, matkhau;
        tendangnhap = edTenDangNhap.getText().toString();
        matkhau = edMatKhau.getText().toString();
        presenterLogicXuLyDangNhap.KiemTraDangNhap(tendangnhap, matkhau);
    }
}
