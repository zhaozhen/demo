package com.example.bean;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


import org.hibernate.annotations.GenericGenerator;

@MappedSuperclass
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)

public abstract class BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "ID_", length = 60)
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid.hex")
    private String id;
    @Column(name = "CREATE_USER_", length = 60)

    private String createUser;
    @Column(name = "CREATE_USER_CNAME_", length = 60)

    private String createUserCname;
    @Column(name = "UPDATE_USER_", length = 60)
    private String updateUser;
    @Column(name = "UPDATE_USER_CNAME_", length = 60)
    private String updateUserCname;
    @Column(name = "CREATE_DATE_")
    private Date createDate;
    @Column(name = "UPDATE_DATE_")
    private Date updateDate;
    @Column(name = "INVALID_")
    private boolean invalid;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public boolean getInvalid() {
        return invalid;
    }

    public void setInvalid(boolean invalid) {
        this.invalid = invalid;
    }

    public String getCreateUserCname() {
        return createUserCname;
    }

    public void setCreateUserCname(String createUserCname) {
        this.createUserCname = createUserCname;
    }

    public String getUpdateUserCname() {
        return updateUserCname;
    }

    public void setUpdateUserCname(String updateUserCname) {
        this.updateUserCname = updateUserCname;
    }


}
