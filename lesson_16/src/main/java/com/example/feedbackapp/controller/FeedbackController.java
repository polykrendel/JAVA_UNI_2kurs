package com.example.feedbackapp.controller;

// Стандартные импорты для Spring Framework
import com.example.feedbackapp.model.Feedback;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FeedbackController {
    private boolean isAuthenticated = false; // Флаг авторизации

    private String registeredUsername = "user";
    private String registeredPassword = "password";

    @GetMapping("/")
    public String showRegisterPage() {
        return "register"; // Переход на страницу регистрации
    }

    @PostMapping("/register")
    public String register(@RequestParam String username, @RequestParam String password, Model model) {
        if (username.isEmpty() || password.isEmpty()) {
            model.addAttribute("error", "Имя пользователя и пароль не могут быть пустыми!");
            return "register";
        }
        registeredUsername = username;
        registeredPassword = password;
        return "redirect:/login"; // Переход на страницу входа
    }

    @GetMapping("/login")
    public String showLoginPage() {
        return "login"; // Переход на страницу входа
    }

    @PostMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password, Model model) {
        if (!registeredUsername.equals(username) || !registeredPassword.equals(password)) {
            model.addAttribute("error", "Неверное имя пользователя или пароль!");
            return "login";
        }
        isAuthenticated = true; // Успешный вход
        return "redirect:/home";
    }

    @GetMapping("/home")
    public String showHomePage(Model model) {
        if (!isAuthenticated) {
            return "redirect:/login"; // Если пользователь не авторизован, перенаправить на логин
        }
        return "home"; // Переход на домашнюю страницу
    }

    @PostMapping("/home")
    public String handleFeedback(@RequestParam String formType, Feedback feedback, Model model) {
        if (!isAuthenticated) {
            return "redirect:/login"; // Проверка авторизации
        }

        if ("feedback".equals(formType)) {
            model.addAttribute("feedbackResult", "Спасибо за ваше сообщение, " + feedback.getName() + "!");
            System.out.println("Обратная связь от " + feedback.getName() + " (" + feedback.getEmail() + "): " + feedback.getMessage());
        }
        model.addAttribute("feedback", "Спасибо за ваше сообщение, " + feedback.getName() + "!");
        return "home";
    }
}
