package com.prj.menu.MenuService.Exception;

public class ExceptionHelper {
    public static RuntimeException throwResourceNotFoundException(){
        return new RuntimeException("Resource not found");
    }

}