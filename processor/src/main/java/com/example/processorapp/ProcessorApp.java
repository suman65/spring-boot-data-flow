package com.example.processorapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.integration.annotation.ServiceActivator;

import lombok.extern.slf4j.Slf4j;

@EnableBinding(Processor.class)
@SpringBootApplication
@Slf4j
public class ProcessorApp 
{

	@ServiceActivator(inputChannel = Processor.INPUT, outputChannel = Processor.OUTPUT)
    public String transform(String payload) 
	{
        log.info("Processor received {} ", payload);
        return payload + " processed";
    }

    public static void main(String[] args) 
    {
        SpringApplication.run(ProcessorApp.class, args);
    }
}
