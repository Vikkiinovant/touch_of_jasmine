package androidx.databinding;

public class DataBinderMapperImpl extends MergedDataBinderMapper {
  DataBinderMapperImpl() {
    addMapper(new com.app.touch_of_jasmine.DataBinderMapperImpl());
  }
}
