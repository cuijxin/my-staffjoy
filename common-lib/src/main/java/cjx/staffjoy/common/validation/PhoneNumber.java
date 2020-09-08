package cjx.staffjoy.common.validation;

public @interface PhoneNumber {
    String message() default "Invalid phone number";
    Class[] groups() default {};
    Class [] payload() default {};
}
