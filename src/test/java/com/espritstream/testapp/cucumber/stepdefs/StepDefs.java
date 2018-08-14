package com.espritstream.testapp.cucumber.stepdefs;

import com.espritstream.testapp.TestApplicationApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = TestApplicationApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
