package com.mao.pojo;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Spitter {

    @NotNull(message = "不能为空")
    @Size(min = 3,max = 15,message = "fistName 不能长于15，小于3")
    private String fistName;
    @NotNull
    @Size(min = 3,max = 15)
    private String lastName;
    @NotNull
    @Size(min = 3,max = 15)
    private String userName;
    @NotNull
    @Size(min = 3,max = 15)
    private String password;

    public Spitter(String fistName, String lastName, String userName, String password) {
        this.fistName = fistName;
        this.lastName = lastName;
        this.userName = userName;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Spitter{" +
                "fistName='" + fistName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", username='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Spitter spitter = (Spitter) o;

        return new EqualsBuilder()
                .append(fistName, spitter.fistName)
                .append(lastName, spitter.lastName)
                .append(userName, spitter.userName)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(fistName)
                .append(lastName)
                .append(userName)
                .toHashCode();
    }

    public String getFistName() {
        return fistName;
    }

    public void setFistName(String fistName) {
        this.fistName = fistName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
