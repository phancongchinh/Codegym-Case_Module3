package com.codegym.controller;

import com.codegym.model.Image;
import com.codegym.service.image.IImageService;
import com.codegym.service.image.ImageService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ImageServlet", value = "/images")
public class ImageServlet extends HttpServlet {

    private static final IImageService IMAGE_SERVICE = new ImageService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create": {

                break;
            }
            default: {
                listAllImage(request, response);
                break;
            }
        }
    }

    private void listAllImage(HttpServletRequest request, HttpServletResponse response) {
        List<Image> images = IMAGE_SERVICE.getAll();
        RequestDispatcher dispatcher = request.getRequestDispatcher("/image/list.jsp");
        request.setAttribute("images", images);
        try {
            dispatcher.forward(request, response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
