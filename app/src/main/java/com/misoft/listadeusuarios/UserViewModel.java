package com.misoft.listadeusuarios;

import androidx.lifecycle.ViewModel;
import java.util.ArrayList;
import java.util.List;

public class UserViewModel extends ViewModel {
    private List<Usuario> userList = new ArrayList<>();

    public void addUser(Usuario usuario) {
        userList.add(usuario);
    }

    public List<Usuario> getUserList() {
        return userList;
    }
}

