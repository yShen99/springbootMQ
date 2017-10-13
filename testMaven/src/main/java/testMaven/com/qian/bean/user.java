package testMaven.com.qian.bean;

import java.io.Serializable;
/**
 * 必须实现Serializable接口，否则redis会报错
 * @author shenyang
 *
 */
public class user implements Serializable{
	private static final long serialVersionUID = 1421967628507315738L;

	private Integer id;

    private String userName;

    private String password;

    private Integer age;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}