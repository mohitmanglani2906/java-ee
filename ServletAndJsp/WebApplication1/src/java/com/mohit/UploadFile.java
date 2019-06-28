
package com.mohit;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;


public class UploadFile extends HttpServlet {

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException 
    {
        ServletFileUpload sf = new ServletFileUpload(new DiskFileItemFactory());
        try
        {
            List<FileItem> files = sf.parseRequest(request);
            for(FileItem item : files)
            {
                item.write(new File("C:\\Users\\mohit2906\\Downloads\\uploaded\\" + item.getName()));
            }
        }
        catch(Exception e)
        {
        }
        
        PrintWriter out = response.getWriter();
        out.println("File Uploaded sucesssfully");
                
        
    }

   
}
