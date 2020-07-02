package com.example.dto;


public class UserDto {
    public String id123;
    public String name;

    public String getId123() {
        return id123;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("UserDto{");
        sb.append("id='").append(id123).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public static void main(String[] args) {
        if (1==2) {

        }
        System.out.println("");
    }
}
