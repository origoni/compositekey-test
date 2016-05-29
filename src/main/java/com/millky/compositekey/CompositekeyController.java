package com.millky.compositekey;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.millky.compositekey.domain.Child;
import com.millky.compositekey.domain.GrandChild;
import com.millky.compositekey.domain.Parent;
import com.millky.compositekey.repository.ChildRepository;
import com.millky.compositekey.repository.GrandChildRepository;
import com.millky.compositekey.repository.ParentRepository;

@RestController
public class CompositekeyController {

	@Autowired
	ChildRepository childRepository;

	@Autowired
	GrandChildRepository grandChildRepository;

	@Autowired
	ParentRepository parentRepository;

	@RequestMapping("/test0")
	public Child test0(Model model) {

		Parent p = new Parent();
		p.setId("origoni");
		p.setName("dk");

		Parent parent = parentRepository.save(p);

		Child c = new Child();
		c.setParent(parent);
		c.setName("onbyul");
		c.setChildId("olivia");

		Child child = childRepository.save(c);

		return child;
	}

	@RequestMapping("/test1")
	public List<Parent> test1(Model model) {

		Parent p = new Parent();
		p.setId("origoni");
		p.setName("dk");

		Parent parent = parentRepository.save(p);

		Child c1 = new Child();
		c1.setParent(parent);
		c1.setName("onbyul");
		c1.setChildId("olivia");

		childRepository.save(c1);

		Child c2 = new Child();
		c2.setParent(parent);
		c2.setName("onsol");
		c2.setChildId("noah");

		childRepository.save(c2);

		return parentRepository.findAll();
	}

	@RequestMapping("/test11")
	public Parent test11(Model model) {

		return parentRepository.findOne("origoni");
	}

	@RequestMapping("/test2")
	public GrandChild test2(Model model) {

		Parent p = new Parent();
		p.setId("origoni");
		p.setName("dk");

		Parent parent = parentRepository.save(p);

		Child c = new Child();
		c.setParent(parent);
		c.setName("onbyul");
		c.setChildId("olivia");

		Child child = childRepository.save(c);

		GrandChild g = new GrandChild();
		g.setChild(child);
		g.setName("onsol");
		g.setGid("noah");

		GrandChild grandChild = grandChildRepository.save(g);

		return grandChild;
	}

	@RequestMapping("/test21")
	public List<Parent> test12(Model model) {

		return parentRepository.findAll();
	}
}
