package com.dhm.initDb.repositories.user.entities;

/**
 * List of actions by module It is necessary to use the same standard for a new
 * added entry : action_module
 */
public enum ModuleAction {
	READ_USER, CREATE_USER, 
	EDIT_USER, DELETE_USER, 
	READ_AUTHORITY, 
	CREATE_AUTHORITY,
	EDIT_AUTHORITY, 
	DELETE_AUTHORITY, 
	READ_CRM, 
	CREATE_CRM, 
	EDIT_CRM, 
	DELETE_CRM, 
	READ_TECHNO, 
	CREATE_TECHNO, 
	EDIT_TECHNO, 
	DELETE_TECHNO, 
	READ_WORKSHEET, 
	CREATE_WORKSHEET, 
	EDIT_WORKSHEET, 
	DELETE_WORKSHEET
}