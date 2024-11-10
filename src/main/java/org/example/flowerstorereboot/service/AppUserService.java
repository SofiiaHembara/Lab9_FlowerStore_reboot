package org.example.flowerstorereboot.service;

import org.example.flowerstorereboot.model.AppUser;
import org.example.flowerstorereboot.repository.AppUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class AppUserService {

    private final AppUserRepository appUserRepository;

    @Autowired
    public AppUserService(AppUserRepository appUserRepository) {
        this.appUserRepository = appUserRepository;
    }

    public List<AppUser> getAllUsers() {
        return appUserRepository.findAll();
    }

    public void addUser(AppUser appUser) {
        Optional<AppUser> userByEmail = appUserRepository.findUserByEmail(appUser.getEmail());
        if (userByEmail.isPresent()) {
            throw new IllegalStateException("Email taken");
        }
        appUserRepository.save(appUser);
    }
}
