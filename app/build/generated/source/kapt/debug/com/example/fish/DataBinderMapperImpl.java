package com.example.fish;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.example.fish.databinding.ActivityDetailBindingImpl;
import com.example.fish.databinding.ActivityLoginBindingImpl;
import com.example.fish.databinding.ActivityMainBindingImpl;
import com.example.fish.databinding.FragmentBottomSheetBindingImpl;
import com.example.fish.databinding.FragmentCartBindingImpl;
import com.example.fish.databinding.FragmentHomeBindingImpl;
import com.example.fish.databinding.FragmentMessageBindingImpl;
import com.example.fish.databinding.FragmentPersonBindingImpl;
import com.example.fish.databinding.ItemAppendImageBindingImpl;
import com.example.fish.databinding.ItemAppendTypeBindingImpl;
import com.example.fish.databinding.ItemCartSaveBindingImpl;
import com.example.fish.databinding.ItemDetailCommentBindingImpl;
import com.example.fish.databinding.ItemDetailContentBindingImpl;
import com.example.fish.databinding.ItemDetailRecommendBindingImpl;
import com.example.fish.databinding.ItemDetailTitleBindingImpl;
import com.example.fish.databinding.ItemDetailUserBindingImpl;
import com.example.fish.databinding.ItemGalleryBindingImpl;
import com.example.fish.databinding.ItemGalleryPhotoBindingImpl;
import com.example.fish.databinding.ItemHomeShopBindingImpl;
import com.example.fish.databinding.ItemNoramlBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYDETAIL = 1;

  private static final int LAYOUT_ACTIVITYLOGIN = 2;

  private static final int LAYOUT_ACTIVITYMAIN = 3;

  private static final int LAYOUT_FRAGMENTBOTTOMSHEET = 4;

  private static final int LAYOUT_FRAGMENTCART = 5;

  private static final int LAYOUT_FRAGMENTHOME = 6;

  private static final int LAYOUT_FRAGMENTMESSAGE = 7;

  private static final int LAYOUT_FRAGMENTPERSON = 8;

  private static final int LAYOUT_ITEMAPPENDIMAGE = 9;

  private static final int LAYOUT_ITEMAPPENDTYPE = 10;

  private static final int LAYOUT_ITEMCARTSAVE = 11;

  private static final int LAYOUT_ITEMDETAILCOMMENT = 12;

  private static final int LAYOUT_ITEMDETAILCONTENT = 13;

  private static final int LAYOUT_ITEMDETAILRECOMMEND = 14;

  private static final int LAYOUT_ITEMDETAILTITLE = 15;

  private static final int LAYOUT_ITEMDETAILUSER = 16;

  private static final int LAYOUT_ITEMGALLERY = 17;

  private static final int LAYOUT_ITEMGALLERYPHOTO = 18;

  private static final int LAYOUT_ITEMHOMESHOP = 19;

  private static final int LAYOUT_ITEMNORAML = 20;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(20);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.fish.R.layout.activity_detail, LAYOUT_ACTIVITYDETAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.fish.R.layout.activity_login, LAYOUT_ACTIVITYLOGIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.fish.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.fish.R.layout.fragment_bottom_sheet, LAYOUT_FRAGMENTBOTTOMSHEET);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.fish.R.layout.fragment_cart, LAYOUT_FRAGMENTCART);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.fish.R.layout.fragment_home, LAYOUT_FRAGMENTHOME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.fish.R.layout.fragment_message, LAYOUT_FRAGMENTMESSAGE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.fish.R.layout.fragment_person, LAYOUT_FRAGMENTPERSON);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.fish.R.layout.item_append_image, LAYOUT_ITEMAPPENDIMAGE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.fish.R.layout.item_append_type, LAYOUT_ITEMAPPENDTYPE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.fish.R.layout.item_cart_save, LAYOUT_ITEMCARTSAVE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.fish.R.layout.item_detail_comment, LAYOUT_ITEMDETAILCOMMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.fish.R.layout.item_detail_content, LAYOUT_ITEMDETAILCONTENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.fish.R.layout.item_detail_recommend, LAYOUT_ITEMDETAILRECOMMEND);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.fish.R.layout.item_detail_title, LAYOUT_ITEMDETAILTITLE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.fish.R.layout.item_detail_user, LAYOUT_ITEMDETAILUSER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.fish.R.layout.item_gallery, LAYOUT_ITEMGALLERY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.fish.R.layout.item_gallery_photo, LAYOUT_ITEMGALLERYPHOTO);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.fish.R.layout.item_home_shop, LAYOUT_ITEMHOMESHOP);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.fish.R.layout.item_noraml, LAYOUT_ITEMNORAML);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYDETAIL: {
          if ("layout/activity_detail_0".equals(tag)) {
            return new ActivityDetailBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_detail is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYLOGIN: {
          if ("layout/activity_login_0".equals(tag)) {
            return new ActivityLoginBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_login is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTBOTTOMSHEET: {
          if ("layout/fragment_bottom_sheet_0".equals(tag)) {
            return new FragmentBottomSheetBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_bottom_sheet is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTCART: {
          if ("layout/fragment_cart_0".equals(tag)) {
            return new FragmentCartBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_cart is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTHOME: {
          if ("layout/fragment_home_0".equals(tag)) {
            return new FragmentHomeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_home is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTMESSAGE: {
          if ("layout/fragment_message_0".equals(tag)) {
            return new FragmentMessageBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_message is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTPERSON: {
          if ("layout/fragment_person_0".equals(tag)) {
            return new FragmentPersonBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_person is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMAPPENDIMAGE: {
          if ("layout/item_append_image_0".equals(tag)) {
            return new ItemAppendImageBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_append_image is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMAPPENDTYPE: {
          if ("layout/item_append_type_0".equals(tag)) {
            return new ItemAppendTypeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_append_type is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMCARTSAVE: {
          if ("layout/item_cart_save_0".equals(tag)) {
            return new ItemCartSaveBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_cart_save is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMDETAILCOMMENT: {
          if ("layout/item_detail_comment_0".equals(tag)) {
            return new ItemDetailCommentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_detail_comment is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMDETAILCONTENT: {
          if ("layout/item_detail_content_0".equals(tag)) {
            return new ItemDetailContentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_detail_content is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMDETAILRECOMMEND: {
          if ("layout/item_detail_recommend_0".equals(tag)) {
            return new ItemDetailRecommendBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_detail_recommend is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMDETAILTITLE: {
          if ("layout/item_detail_title_0".equals(tag)) {
            return new ItemDetailTitleBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_detail_title is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMDETAILUSER: {
          if ("layout/item_detail_user_0".equals(tag)) {
            return new ItemDetailUserBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_detail_user is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMGALLERY: {
          if ("layout/item_gallery_0".equals(tag)) {
            return new ItemGalleryBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_gallery is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMGALLERYPHOTO: {
          if ("layout/item_gallery_photo_0".equals(tag)) {
            return new ItemGalleryPhotoBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_gallery_photo is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMHOMESHOP: {
          if ("layout/item_home_shop_0".equals(tag)) {
            return new ItemHomeShopBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_home_shop is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMNORAML: {
          if ("layout/item_noraml_0".equals(tag)) {
            return new ItemNoramlBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_noraml is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(2);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    result.add(new com.example.base.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(2);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "viewModel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(20);

    static {
      sKeys.put("layout/activity_detail_0", com.example.fish.R.layout.activity_detail);
      sKeys.put("layout/activity_login_0", com.example.fish.R.layout.activity_login);
      sKeys.put("layout/activity_main_0", com.example.fish.R.layout.activity_main);
      sKeys.put("layout/fragment_bottom_sheet_0", com.example.fish.R.layout.fragment_bottom_sheet);
      sKeys.put("layout/fragment_cart_0", com.example.fish.R.layout.fragment_cart);
      sKeys.put("layout/fragment_home_0", com.example.fish.R.layout.fragment_home);
      sKeys.put("layout/fragment_message_0", com.example.fish.R.layout.fragment_message);
      sKeys.put("layout/fragment_person_0", com.example.fish.R.layout.fragment_person);
      sKeys.put("layout/item_append_image_0", com.example.fish.R.layout.item_append_image);
      sKeys.put("layout/item_append_type_0", com.example.fish.R.layout.item_append_type);
      sKeys.put("layout/item_cart_save_0", com.example.fish.R.layout.item_cart_save);
      sKeys.put("layout/item_detail_comment_0", com.example.fish.R.layout.item_detail_comment);
      sKeys.put("layout/item_detail_content_0", com.example.fish.R.layout.item_detail_content);
      sKeys.put("layout/item_detail_recommend_0", com.example.fish.R.layout.item_detail_recommend);
      sKeys.put("layout/item_detail_title_0", com.example.fish.R.layout.item_detail_title);
      sKeys.put("layout/item_detail_user_0", com.example.fish.R.layout.item_detail_user);
      sKeys.put("layout/item_gallery_0", com.example.fish.R.layout.item_gallery);
      sKeys.put("layout/item_gallery_photo_0", com.example.fish.R.layout.item_gallery_photo);
      sKeys.put("layout/item_home_shop_0", com.example.fish.R.layout.item_home_shop);
      sKeys.put("layout/item_noraml_0", com.example.fish.R.layout.item_noraml);
    }
  }
}
