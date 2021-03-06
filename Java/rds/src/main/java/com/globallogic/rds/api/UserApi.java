/**
 * NOTE: This class is auto generated by the swagger code generator program (2.3.1).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package com.globallogic.rds.api;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.globallogic.rds.api.model.AlumnoMateriaType;
import com.globallogic.rds.api.model.BasicUserType;
import com.globallogic.rds.api.model.HeaderType;
import com.globallogic.rds.api.model.ListOfMateriasType;
import com.globallogic.rds.api.model.LoginType;
import com.globallogic.rds.api.model.LoguotType;
import com.globallogic.rds.api.model.UserType;


@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-05-15T23:29:47.910Z")


public interface UserApi {

   
    @RequestMapping(value = "/user/{user_id}/materia/{materia_id}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Void> changeMateria(@PathVariable("user_id") String userId,@PathVariable("materia_id") String materiaId);


  
    @RequestMapping(value = "/user/{user_id}/materia/{materia_id}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    ResponseEntity<AlumnoMateriaType> getMateria(@PathVariable("user_id") String userId,@PathVariable("materia_id") String materiaId);


    
    @RequestMapping(value = "/user/{user_id}/materias",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<ListOfMateriasType> getMaterias(@PathVariable("user_id") String userId);


    
    @RequestMapping(value = "/user/{userName}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<UserType> getUserByName( @PathVariable("userName") String userName,@RequestHeader(value="token", required=true) String token);


   
    @RequestMapping(value = "/user/login",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<HeaderType> login( @Valid @RequestBody LoginType login);


    
    @RequestMapping(value = "/user/loguot",
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Void> loguot( @RequestHeader(value="token", required=true) String token,  @Valid @RequestBody LoguotType loguot);


    
    @RequestMapping(value = "/user/singin",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<HeaderType> singin( @Valid @RequestBody BasicUserType sigin);


}
