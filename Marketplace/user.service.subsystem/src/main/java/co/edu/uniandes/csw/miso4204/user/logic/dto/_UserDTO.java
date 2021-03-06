/* ========================================================================
 * Copyright 2014 miso4204
 *
 * Licensed under the MIT, The MIT License (MIT)
 * Copyright (c) 2014 miso4204

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in
all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
THE SOFTWARE.
 * ========================================================================


Source generated by CrudMaker version 1.0.0.qualifier

*/

package co.edu.uniandes.csw.miso4204.user.logic.dto;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement 
public abstract class _UserDTO {

	

	private Long id;
	

	private String username;
	

	private String password;
	

	private String email;
	

	private String firstName;
	

	private String secondName;
	

	private String lastName;
	

	private String birthDate;
	

	private String gender;
	

	private String name;



	public Long getId() {
		return id;
	}
 
	public void setId(Long id) {
		this.id = id;
	}


	public String getUsername() {
		return username;
	}
 
	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}
 
	public void setPassword(String password) {
		this.password = password;
	}


	public String getEmail() {
		return email;
	}
 
	public void setEmail(String email) {
		this.email = email;
	}


	public String getFirstName() {
		return firstName;
	}
 
	public void setFirstName(String firstname) {
		this.firstName = firstname;
	}


	public String getSecondName() {
		return secondName;
	}
 
	public void setSecondName(String secondname) {
		this.secondName = secondname;
	}


	public String getLastName() {
		return lastName;
	}
 
	public void setLastName(String lastname) {
		this.lastName = lastname;
	}


	public String getBirthDate() {
		return birthDate;
	}
 
	public void setBirthDate(String birthdate) {
		this.birthDate = birthdate;
	}


	public String getGender() {
		return gender;
	}
 
	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getName() {
		return name;
	}
 
	public void setName(String name) {
		this.name = name;
	}
	
}