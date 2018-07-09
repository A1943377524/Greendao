package com.example.lenovo.greendao;

import android.util.Log;

import com.example.lenovo.greendao.greendao.StudentDao;

import java.util.List;

/**
 * Created by lenovo on 2018/6/6.
 */

public class GreenDaoManager {
    private static final String TAG = "GreenDaoManager";

    private static GreenDaoManager instance;
    private StudentDao dao;

    public static GreenDaoManager getInstance() {
        if (instance == null) {
            synchronized (GreenDaoManager.class) {
                if (instance == null) {
                    instance = new GreenDaoManager();
                }
            }
        }
        return instance;
    }

    private GreenDaoManager() {
        dao = MyApplication.getApplication().getDaoSession().getStudentDao();
    }


    /**
     * 增加数据
     *
     * @param student
     * @return
     */
    long insertData(Student student) {
        Log.d(TAG,"insert===>"+student);
        return dao.insert(student);
    }

    /**
     * 删除数据
     *
     * @param id keyId
     */
    public void deleteData(Long id) {
        Log.d(TAG,"delete===>id"+id);
        dao.deleteByKey(id);
    }

    /**
     * 更改数据
     */
    public void updateData(Student student) {
        Log.d(TAG,"update===>"+student);
        dao.update(student);
    }

    /**
     * 查寻所有数据
     */
    public List<Student> queryAllData() {
        return dao.loadAll();
    }
}
