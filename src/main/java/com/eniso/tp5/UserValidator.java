
package com.eniso.tp5;
class UserValidator {
    public void validateAge(int age) throws UserAgeException {
        if (age < 18) {
            throw new UserAgeException("L'utilisateur doit avoir au moins 18 ans.");
        }
    }
}



