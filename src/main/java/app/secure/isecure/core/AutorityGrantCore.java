/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package app.secure.isecure.core;

import java.security.Principal;
import java.util.HashSet;
import java.util.Set;
import org.springframework.security.authentication.jaas.AuthorityGranter;

/**
 *
 * @author mansoor
 */
public class AutorityGrantCore implements AuthorityGranter{

    @Override
    public Set<String> grant(Principal principal) {
        //throw new UnsupportedOperationException("Not supported yet.");
        Set<String> roles=new HashSet<String>();
        //roles.add(principal.getName().equals("admin")?"admin":"nonAdmin");
        roles.add("ROLE_USER");
        
        
        return roles;
    }
    
}