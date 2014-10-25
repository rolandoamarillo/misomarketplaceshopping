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

package co.edu.uniandes.csw.miso4204.category.service;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import javax.inject.Inject;

import co.edu.uniandes.csw.miso4204.category.logic.api.ICategoryLogicService;
import co.edu.uniandes.csw.miso4204.category.logic.dto.CategoryDTO;
import co.edu.uniandes.csw.miso4204.category.logic.dto.CategoryPageDTO;


public abstract class _CategoryService {

	@Inject
	protected ICategoryLogicService categoryLogicService;
	
	@POST
	public CategoryDTO createCategory(CategoryDTO category){
		return categoryLogicService.createCategory(category);
	}
	
	@DELETE
	@Path("{id}")
	public void deleteCategory(@PathParam("id") Long id){
		categoryLogicService.deleteCategory(id);
	}
	
	@GET
	public CategoryPageDTO getCategorys(@QueryParam("page") Integer page, @QueryParam("maxRecords") Integer maxRecords){
		return categoryLogicService.getCategorys(page, maxRecords);
	}
	
	@GET
	@Path("{id}")
	public CategoryDTO getCategory(@PathParam("id") Long id){
		return categoryLogicService.getCategory(id);
	}
	
	@PUT
	public void updateCategory(@PathParam("id") Long id, CategoryDTO category){
		categoryLogicService.updateCategory(category);
	}
	
}