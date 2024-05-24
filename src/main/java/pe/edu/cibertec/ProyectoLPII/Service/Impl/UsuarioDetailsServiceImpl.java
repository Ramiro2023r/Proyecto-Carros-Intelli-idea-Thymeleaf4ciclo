package pe.edu.cibertec.ProyectoLPII.Service.Impl;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.ProyectoLPII.Model.Authority;
import pe.edu.cibertec.ProyectoLPII.Model.Usuario;
import pe.edu.cibertec.ProyectoLPII.Service.IUsuarioService;

@Service
public class UsuarioDetailsServiceImpl implements UserDetailsService{

    @Autowired
    IUsuarioService usuarioService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        //Buscar el usuario con el repositorio y si no existe lanzar una exepcion
        Usuario appUser = usuarioService.findByUsername(username).orElseThrow(() -> new UsernameNotFoundException("No existe usuario"));

        //Mapear nuestra lista de Authority con la de spring security
        List grantList = new ArrayList();
        for (Authority authority: appUser.getAuthority()) {
            // ROLE_USER, ROLE_ADMIN,..
            GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(authority.getAuthority());
            grantList.add(grantedAuthority);
        }

        //Crear El objeto UserDetails que va a ir en sesion y retornarlo.
        UserDetails user = (UserDetails) new User(appUser.getUsername(), appUser.getPassword(), grantList);
        return user;

    }
}
