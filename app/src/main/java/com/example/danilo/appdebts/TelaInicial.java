package com.example.danilo.appdebts;

import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.support.constraint.ConstraintLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.danilo.appdebts.classes.Category;
import com.example.danilo.appdebts.classes.Debts;
import com.example.danilo.appdebts.dao.CategoryDAO;
import com.example.danilo.appdebts.dao.DebtsDAO;
import com.example.danilo.appdebts.database.DatabaseHelper;

public class TelaInicial extends AppCompatActivity {

    private SQLiteDatabase mConection;
    private DatabaseHelper mDataHelper;
    private ConstraintLayout mLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_inicial);

        mLayout = findViewById(R.id.layout);

        createConnection();
        CategoryDAO catDao = new CategoryDAO(mConection);
        DebtsDAO debtsDao = new DebtsDAO(mConection);
        //debtsDao.insert(new Debts(catDao.getCategory(2),(float)5.50,"Coxinha e café","12/07/2016",""));
        //debtsDao.insert(new Debts(catDao.getCategory(2),(float)5.50,"Pastel","10/07/2016",""));
        //debtsDao.insert(new Debts(catDao.getCategory(4),(float)119.90,"Ração dos cachorros","05/07/2016",""));

        //Category cat = catDao.getCategory(2);
        //cat.setType("Tia do Lanche");
        //catDao.alter(cat);
        //debtsDao.remove(1);
        //debtsDao.remove(2);
        //debtsDao.remove(3);

        //catDao.insert(cat);
        catDao.listCategories();
        debtsDao.listDebts();
        mConection.close();
    }


    private void createConnection() {
        try {
            mDataHelper = new DatabaseHelper(this);
            mConection = mDataHelper.getWritableDatabase();
            Snackbar.make(mLayout, R.string.sucess_conection, Snackbar.LENGTH_LONG).show();
        } catch (SQLException e) {
            Snackbar.make(mLayout, e.toString(), Snackbar. LENGTH_LONG).show();
        }
    }
}
