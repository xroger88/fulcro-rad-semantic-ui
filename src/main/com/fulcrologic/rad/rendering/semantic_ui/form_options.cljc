(ns com.fulcrologic.rad.rendering.semantic-ui.form-options)

(def ref-container-class
  "This option can be used in the ::fo/subforms entries to indicate what class(es) should be set on the element that wraps
  the list of elements. Defaults to `ui segments` for to-many and nothing for to-one relations. Can also be a
  `(fn [form-env] string?)`"
  :com.fulcrologic.rad.rendering.semantic-ui.form/ref-container-class)

(def ref-element-class
  "This option can be used in a form's component options to indicate the class to set on the (generated) element itself
  when used as a subform.

  Can be a string or a `(fn [form-env] string?)`.  Defaults to `ui segment`."
  :com.fulcrologic.rad.rendering.semantic-ui.form/ref-element-class)

(def top-level-class
  "Used in a form's component-options. Specifies the class of the overall form container when it is the master (top-level) form.
   Defaults to `ui container`. Can be a string or a `(fn [form-env] string?)`.

  See also `ref-element-class`."
  :com.fulcrologic.rad.rendering.semantic-ui.form/top-level-class)

(def controls-class
  "Used in a form's component-options. Specifies the container class for the control section of the top-level form.
   Defaults to `ui top attached segment`. Can be a string or a `(fn [form-env] string?)`."
  :com.fulcrologic.rad.rendering.semantic-ui.form/controls-class)

(def form-class
  "Used in a form's component-options. Specifies the container class for the form inputs. Defaults to `ui attached form`.
   Can be a string or a `(fn [form-env] string?)`."
  :com.fulcrologic.rad.rendering.semantic-ui.form/form-class)

(def input-props
  "ALIAS of `fo/input-props`. This option can be placed on `fo/field-style-config(s)`.
   The value can be a map, or a `(fn [form-env] map?)`.

   Many, but not all, SUI input controls support this option.

   See also `fo/input-props`."
  :input/props)
