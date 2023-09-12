package androidx.databinding;

public class DataBinderMapperImpl extends MergedDataBinderMapper {
  DataBinderMapperImpl() {
    addMapper(new kr.co.itforone.tdaeri2.DataBinderMapperImpl());
  }
}
