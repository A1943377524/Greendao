package com.example.lenovo.greendao;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by lenovo on 2018/6/6.
 */
@Entity
public class Student {
    @Id
    private Long id;//
    private String name;
    private String sex;
    private int age;
    private float score;
    private boolean isSelected;
    @Generated(hash = 66442372)
    public Student(Long id, String name, String sex, int age, float score,
            boolean isSelected) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.score = score;
        this.isSelected = isSelected;
    }
    @Generated(hash = 1556870573)
    public Student() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSex() {
        return this.sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }
    public int getAge() {
        return this.age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public float getScore() {
        return this.score;
    }
    public void setScore(float score) {
        this.score = score;
    }
    public boolean getIsSelected() {
        return this.isSelected;
    }
    public void setIsSelected(boolean isSelected) {
        this.isSelected = isSelected;
    }


}
