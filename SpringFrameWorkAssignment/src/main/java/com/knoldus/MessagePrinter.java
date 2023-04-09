package com.knoldus;

public class MessagePrinter {

    private MessageService messageService;

    public MessageService getMessageService() {
        return messageService;
    }

    public void setMessageService(MessageService messageService) {
        this.messageService = messageService;
    }

    public void displayMessageService(){
        System.out.println(getMessageService().showMessage());
    }
}
