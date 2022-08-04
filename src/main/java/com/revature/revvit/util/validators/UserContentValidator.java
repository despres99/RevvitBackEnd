package com.revature.revvit.util.validators;

import com.azure.cosmos.implementation.apachecommons.lang.StringUtils;
import com.revature.revvit.usercontent.UserContentModel;
import com.revature.revvit.util.custom_exception.InvalidRequestException;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UserContentValidator {

    public static final void validate(Object obj) {
        Validator validator = Validation.buildDefaultValidatorFactory().getValidator();
        List<String> errorList = validator.validate(obj)
                .stream()
                .map(ConstraintViolation::getMessage)
                .collect(Collectors.toList());

        if(!errorList.isEmpty()) throw new InvalidRequestException(StringUtils.join(errorList, ", "));
    }
}
