package com.jessicafeitosa.webservicesmongodb.config;

import com.jessicafeitosa.webservicesmongodb.domain.User;
import com.jessicafeitosa.webservicesmongodb.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.TimeZone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Instantiation implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy")
        sdf.setTimeZone(TimeZone.getTimeZone("GMT"));

        userRepository.deleteAll();

        User maria = new User(null, "Maria Brown", "maria@gmail.com");
        User alex = new User(null, "Alex Green", "alex@gmail.com");
        User bob = new User(null, "Bob Grey", "bob@gmail.com");

        Post post1 = new Post(null,sdf.parse("21/03/2021"), "Partiu viagem", "Vou viajar para São Paulo. Beijos!")

        userRepository.saveAll(Arrays.asList(maria, alex, bob));

    }
}
