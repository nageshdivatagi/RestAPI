package in.nsoft.rest.menu;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import in.nsoft.rest.roles.Rolespages;
import in.nsoft.rest.test.Department;
import in.nsoft.rest.test.DeptEmployee;

/**
 * @author nagesh.divatagi
 *
 * @CreateDate 16-Apr-2020 10:16:49 pm
 * @FileNams Pages.java
 */
@Entity
public class Menu {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	public Long id;
	public String title;
	public String routerLink;
	public String href;
	public String icon;
	public String target;
	public boolean hasSubMenu;
	public int parentId;
	@ManyToOne
	private Rolespages rolePages;

	protected Menu() {

	}

	public Menu(Long id, String title, String routerLink, String href, String icon, String target, boolean hasSubMenu,
			int parentId) {
		super();
		this.id = id;
		this.title = title;
		this.routerLink = routerLink;
		this.href = href;
		this.icon = icon;
		this.target = target;
		this.hasSubMenu = hasSubMenu;
		this.parentId = parentId;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getRouterLink() {
		return routerLink;
	}

	public void setRouterLink(String routerLink) {
		this.routerLink = routerLink;
	}

	public String getHref() {
		return href;
	}

	public void setHref(String href) {
		this.href = href;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getTarget() {
		return target;
	}

	public void setTarget(String target) {
		this.target = target;
	}

	public boolean isHasSubMenu() {
		return hasSubMenu;
	}

	public void setHasSubMenu(boolean hasSubMenu) {
		this.hasSubMenu = hasSubMenu;
	}

	public int getParentId() {
		return parentId;
	}

	public void setParentId(int parentId) {
		this.parentId = parentId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (hasSubMenu ? 1231 : 1237);
		result = prime * result + ((href == null) ? 0 : href.hashCode());
		result = prime * result + ((icon == null) ? 0 : icon.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + parentId;
		result = prime * result + ((routerLink == null) ? 0 : routerLink.hashCode());
		result = prime * result + ((target == null) ? 0 : target.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Menu other = (Menu) obj;
		if (hasSubMenu != other.hasSubMenu)
			return false;
		if (href == null) {
			if (other.href != null)
				return false;
		} else if (!href.equals(other.href))
			return false;
		if (icon == null) {
			if (other.icon != null)
				return false;
		} else if (!icon.equals(other.icon))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (parentId != other.parentId)
			return false;
		if (routerLink == null) {
			if (other.routerLink != null)
				return false;
		} else if (!routerLink.equals(other.routerLink))
			return false;
		if (target == null) {
			if (other.target != null)
				return false;
		} else if (!target.equals(other.target))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Menu [id=" + id + ", title=" + title + ", routerLink=" + routerLink + ", href=" + href + ", icon="
				+ icon + ", target=" + target + ", hasSubMenu=" + hasSubMenu + ", parentId=" + parentId + "]";
	}

}
