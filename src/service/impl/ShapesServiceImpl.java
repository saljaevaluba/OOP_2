package service.impl;

import color.Color;
import service.ShapesService;
import shape.Shape;

import java.util.List;
import java.util.Set;
import java.util.HashSet;

import static java.lang.Double.max;

public class ShapesServiceImpl implements ShapesService {


    @Override
    public double getSquares(List<Shape> superList) {
        double sum = 0;
        for(int i = 0; i < superList.size(); i ++)
        {
            sum += superList.get(i).getArea();
        }
        return sum;
    }

    @Override
    public double getMaxPerimetrs(List<Shape> shapeList) {
        double max = 0;
        for(int i = 0; i < shapeList.size(); i ++)
        {
            max = max(shapeList.get(i).getPerimeter(), max);
        }
        return max;
    }

    @Override
    public Set<Color> getColors(List<Shape> shapeList) {
        Set<Color> ans = new HashSet<Color>();
        for(int i = 0; i < shapeList.size(); i ++)
        {
            ans.add(shapeList.get(i).getColor());
        }
        return ans;
    }
}
