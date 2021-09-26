package com.example.demo.auth;

import java.util.Collection;

import org.springframework.security.core.userdetails.UserDetails;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Userprincipal implements UserDetails {
	  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long userId;
	    private String username;
	    private String password;
	    private Collection authorities;
		@Override
		public boolean isAccountNonExpired() {
			// TODO Auto-generated method stub
			return false;
		}
		@Override
		public boolean isAccountNonLocked() {
			// TODO Auto-generated method stub
			return false;
		}
		@Override
		public boolean isCredentialsNonExpired() {
			// TODO Auto-generated method stub
			return false;
		}
		@Override
		public boolean isEnabled() {
			// TODO Auto-generated method stub
			return false;
		}

}
