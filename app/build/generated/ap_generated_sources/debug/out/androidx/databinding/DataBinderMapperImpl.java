package androidx.databinding;

public class DataBinderMapperImpl extends MergedDataBinderMapper {
  DataBinderMapperImpl() {
    addMapper(new com.code_rv_mvvm.DataBinderMapperImpl());
  }
}
