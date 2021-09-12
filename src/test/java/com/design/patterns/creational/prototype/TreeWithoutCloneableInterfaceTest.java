package com.design.patterns.creational.prototype;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;
import static org.junit.Assert.assertEquals;

public class TreeWithoutCloneableInterfaceTest {

    @Test
    public void givenAppleTreePrototypeWhenClonedThenCreateA_Clone() {
        double mass = 10.0;
        double height = 3.7;
        Position position = new Position(3, 7);
        Position otherPosition = new Position(4, 8);

        AppleTree appleTree = new AppleTree(mass, height);
        appleTree.setPosition(position);

        AppleTree anotherAppleTree = (AppleTree) appleTree.copy();
        anotherAppleTree.setPosition(otherPosition);

        assertEquals(position, appleTree.getPosition());
        assertEquals(otherPosition, anotherAppleTree.getPosition());

    }

    @Test
    public void givenAOrangeTreePrototypeWhenClonedThenCreateA_Clone() {
        double mass = 10.0;
        double height = 3.7;
        Position position = new Position(3, 7);
        Position otherPosition = new Position(4, 8);

        OrangeTree orangeTree = new OrangeTree(mass, height);
        orangeTree.setPosition(position);
        OrangeTree anotherPineTree = (OrangeTree) orangeTree.copy();
        anotherPineTree.setPosition(otherPosition);

        assertEquals(position, orangeTree.getPosition());
        assertEquals(otherPosition, anotherPineTree.getPosition());
    }

    @Test
    public void givenA_ListOfTreesWhenClonedThenCreateListOfClones() {
        double mass = 10.0;
        double height = 3.7;
        Position position = new Position(3, 7);
        Position orangePosition = new Position(4, 8);

        AppleTree appleTree = new AppleTree(mass, height);
        appleTree.setPosition(position);

        OrangeTree orangeTree = new OrangeTree(mass, height);
        orangeTree.setPosition(orangePosition);

        List<Tree> trees = Arrays.asList(appleTree, orangeTree);

        List<Tree> treeClones = trees.stream()
                .map(Tree::copy)
                .collect(toList());

        Tree appleTreeClone = treeClones.get(0);

        assertEquals(mass, appleTreeClone.getMass(), 0.0);
        assertEquals(height, appleTreeClone.getHeight(), 0.0);
        assertEquals(position, appleTreeClone.getPosition());

        Tree orangeTreeClone = treeClones.get(1);

        assertEquals(mass, orangeTreeClone.getMass(), 0.0);
        assertEquals(height, orangeTreeClone.getHeight(), 0.0);
        assertEquals(orangePosition, orangeTreeClone.getPosition());
    }

}