package com.millky.compositekey;

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

	@RequestMapping("/test1")
	public Child test1(Model model) {

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
		g.setId("noah");
		g.setName("onsol");

		GrandChild grandChild = grandChildRepository.save(g);

		return grandChild;
	}

}
