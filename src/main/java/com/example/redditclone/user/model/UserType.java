package com.example.redditclone.user.model;

public enum UserType {
    USER("USER"),
    ADMIN("ADMIN"),
    MODERATOR("MODERATOR"),
    SUB_ADMIN("SUB_ADMIN");

    private String type;
    UserType(String userType) {
        this.type = userType;
    }
    public static UserType getUserByType(String type) throws Exception {

        for (UserType userType : values()) {
            if (userType.type.equals(type)) {
                return userType;
            }
        }
        throw new Exception(String.format("Enum not found with type %s", type));
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
