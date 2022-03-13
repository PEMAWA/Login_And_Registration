package com.cturns.login.and.registration.Registration.Token;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ConfirmationTokenService {
    public ConfirmationTokenRepository confirmationTokenRepository;

    public  void saveConfirmation(ConfirmationToken token){

        confirmationTokenRepository.save(token);
    }
}
